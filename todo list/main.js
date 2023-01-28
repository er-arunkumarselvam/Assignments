let listInput = document.querySelector(".entered-list");
let addList = document.querySelector(".btn-list");
let taskList = document.querySelector(".task");

listInput.addEventListener('keyup', () => {
    if (listInput.value.trim() != 0){
        addList.classList.add('active') 
    }else {
        addList.classList.remove('active') 
    }
})

addList.addEventListener('click', () => {
    if (listInput.value.trim() != 0) {
        let newList = document.createElement('div');
        newList.classList.add('items');
        newList.innerHTML = ` 
        <p> ${listInput.value} </p>
        <div class="item-btn">
                    <i class="fa-regular fa-pen-to-square"></i>
                <i class="fa-regular fa-trash-can"></i>
                </div>
        `
        taskList.appendChild(newList);
        listInput.value = '';
    } else {
        alert("Please enter a task.")
    }
})

taskList.addEventListener('click', (e) => {
    if (e.target.classList.contains('fa-trash-can')) {
        e.target.parentElement.parentElement.remove();
    }
})

taskList.addEventListener('click', (e) => {
    if (e.target.classList.contains('fa-pen-to-square')) {
        e.target.parentElement.parentElement.classList.toggle('completed');
    }
})
