function getDescription(){
    values = fetch("/challenge")
    .then(response => response.json())
    .then(data => updateDescription(data));
}
function updateDescription(data){
    x = document.getElementById("challenges").selectedIndex;
    selectedChallenge = document.getElementsByTagName("option")[x].value
    mychallenge = data.find(x=>x.id == selectedChallenge);
    document.getElementById("description").innerHTML = mychallenge.description;
}


function submitCode(){
    x = document.getElementById("challenges").selectedIndex;
    selectedChallenge = document.getElementsByTagName("option")[x].value

    submitScore = {}
    submitScore.taskId = selectedChallenge
    submitScore.languageId = 5; // Python only for now
    submitScore.input = document.getElementById("codeSubmission").value;
    submitScore.name = "Håkon" //not implementing high score for now
    console.log(submitScore);
    response = fetch("/challenge/submitTask", {
        method : "POST",
        headers : {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(submitScore)
    })
    response
    .then(response => response.json())
    .then(data => alert(data.score));
}