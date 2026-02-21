fetch('./data/exercises.json')
    .then(response => response.json())
    .then(data => {

        const exercises = data.exercises;
        const container = document.getElementById('exercises-container');

        exercises.forEach(exercise => {
            const card = document.createElement('div');
            card.innerHTML = `
                <h2>${exercise.title}</h2>
                <p>${exercise.chapter}</p>
                <p>${exercise.difficulty}</p>
                <p>${exercise.explanation}</p>
            `;
            container.appendChild(card)
        })

    })