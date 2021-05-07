// Variables
let url = "http://worldclockapi.com/api/json/est/now";
let resp = "";

//Fetch the results from the url
fetch(url)
    //Parse the response as JSON
   .then(response => response.json())
   .then((date) => {
        //Iterate over each key:value pair in the JSON response
        Object.keys(date).forEach(key => {
          resp +='<br>' + key + ':' + date[key] + '</br>';
          console.log(key + ':' + date[key]);
        });
        //Replace date-and-time-list div by the string formed in JSON parsing.
        const datesDiv = document.querySelector('#date-and-time-list');
        //innerHTML returns a serialized HTML code.
        datesDiv.innerHTML = resp;
   })
   //If fetch fails, log the exception
   .catch(erro => {
        console.log(erro);
   });
