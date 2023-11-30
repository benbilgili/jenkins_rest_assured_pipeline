<h1>Jenkins Rest Assured Pipeline</h1>  

Pipeline created which linked to this GitHub repo using Ngrok. When a change is pushed to the repo, Jenkins is notified and the pipeline is prompted to run. <br>
This triggers the RestAssured API tests to run against my API which is launched as part of the pipeline automatically. <br>

RUN JENKINS: <br>
* Nav to: C:\Users\BenScott\OneDrive - 2i Limited\Documents\training\jenkins> <br>
* Run: java -jar jenkins.war --enable-future-java <br>

RUN NGROK: <br>
* Nav to: C:\Users\BenScott\AppData\Local\ngrok> <br>
* Run: ngrok http http://localhost:8080 <br>

<h5>Push a change to this repo to see the pipeline in action</h5> <br>
