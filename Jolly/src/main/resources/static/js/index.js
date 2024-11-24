/*async function openNavbar() {
  document.getElementById("sideNavigationBar").style.width = "50%";

  const url = "https://api.api-ninjas.com/v1/exercises?muscle=biceps";
  try {
    const response = await fetch(url, {
      headers: { "X-Api-Key": "XMLHe35w5y7kc4Hml40hMjrB0NHn9XgFDUua5ooU" },
      contentType: "application/json",
    });
    if (!response.ok) {
      throw new Error(`Response status: ${response.status}`);
    }

    const json = await response.json();
    console.log(json);
  } catch (error) {
    console.error(error.message);
  }
}
function closeNavbar() {
  document.getElementById("sideNavigationBar").style.width = "0%";
}
*/

