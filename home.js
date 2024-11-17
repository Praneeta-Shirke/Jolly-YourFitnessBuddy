document.addEventListener('DOMContentLoaded', () => {
//   document.getElementById("HappyJolly");
//   const maxplay = 3;
//   let playcount = 0;

//   if (playcount < maxplay) {
//     video.play();
//   }
const Logsbutton = document.getElementById('playHappyJolly');
    const happyjollycontainer = document.getElementById('HappyJolly');
    Logsbutton.addEventListener('click', () => {
        happyjollycontainer.style.display = 'block';

        Logsbutton.textContent = 'iFrame Loaded!';
        Logsbutton.disabled = true;
        confetti({
            particleCount: 100,
            spread: 70,
            origin: { x: 0.5, y: 0.5 }
        });
    });
});
