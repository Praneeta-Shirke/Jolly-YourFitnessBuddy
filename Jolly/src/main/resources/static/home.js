const apiUrl = 'http://localhost:8080/api';

        async function fetchOptions(endpoint, elementId) {
            const response = await fetch(`${apiUrl}/${endpoint}`);
            const data = await response.json();

            const selectElement = document.getElementById(elementId);
            data?.forEach(item => {
                const option = document.createElement('option');
                option.value = item.id;
                option.textContent = item.name;
                selectElement.appendChild(option);
            });
        }

        async function fetchNutrition(query) {
            const response = await fetch(`${apiUrl}/nutrition?query=${query}`);
            return await response.json();
        }

        async function logData() {
            const workoutId = document.getElementById('workout').value;
            const dietId = document.getElementById('diet').value;
            const query = document.getElementById('query').value;

            const nutritionData = await fetchNutrition(query);

            const response = await fetch(`${apiUrl}/user-logs`, {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify({
                    workout: { id: workoutId },
                    diet: { id: dietId },
                    nutritionInfo: JSON.stringify(nutritionData.items),
                }),
            });

            if (response.ok) {
                alert('Data logged successfully!');
                fetchHistory();
            } else {
                alert('Failed to log data.');
            }
        }

        async function fetchHistory() {
            const response = await fetch(`${apiUrl}/user-logs`);
            const logs = await response.json();

            const historyElement = document.getElementById('history');
            historyElement.innerHTML = '';

            logs.forEach(log => {
                const item = document.createElement('li');
                item.textContent = `Workout: ${log.workout?.name || 'N/A'}, Diet: ${log.diet?.name || 'N/A'}, 
                    Nutrition: ${log.nutritionInfo || 'No data'}, Date: ${log.createdAt}`;
                historyElement.appendChild(item);
            });
        }

        // Initialize options and history
        fetchOptions('workouts', 'workout');
        fetchOptions('diets', 'diet');
        fetchHistory();