document.addEventListener('DOMContentLoaded', () => {
    fetch('./data/exercises.json')
        .then(response => response.json())
        .then(data => {
            const chapters = data.chapters;
            const grid = document.querySelector('.chapters-grid');

            chapters.forEach(chapter => {
                const card = document.createElement('div');
                card.className = "chapter-card";
                card.innerHTML = `
                    <h3>Chapter ${chapter.id}</h3>
                    <p>${chapter.name}</p>
                `;
                card.style.cursor = 'pointer';
                card.onclick = () => {
                    window.location.href = `chapter.html?id=${chapter.id}`;
                };
                grid.appendChild(card);
            });

        });
});

