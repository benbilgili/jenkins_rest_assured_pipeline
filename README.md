<h1>Jenkins Rest Assured Pipeline</h1>  

Pipeline created which linked to this GitHub repo using Ngrok. When a change is pushed to the repo, Jenkins is notified and the pipeline is prompted to run. 
This triggers the RestAssured API tests to run against my API which is launched as part of the pipeline automatically. 

RUN JENKINS: 
Nav to: C:\Users\BenScott\OneDrive - 2i Limited\Documents\training\jenkins>
Run: java -jar jenkins.war --enable-future-java

RUN NGROK: 
Nav to: C:\Users\BenScott\AppData\Local\ngrok> 
Run: ngrok http http://localhost:8080

* Push a change to this repo to see the pipeline in action
