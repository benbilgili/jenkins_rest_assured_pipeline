<h1>Jenkins Rest Assured Pipeline</h1>  

Pipeline created which linked to this GitHub repo using Ngrok. When a change is pushed to the repo, Jenkins is notified and the pipeline is prompted to run. <br>
This triggers the RestAssured API tests to run against my API which is launched as part of the pipeline automatically. <br>

RUN JENKINS VIA DOCKER: <br>
* On Mac, run docker container for Jenkins <br>

RUN NGROK: <br>
* Visit http://192.168.1.65:8080/job/RestAssured%20Testing%20Pipeline/
* Build Now

<h5>Push a change to this repo to see the pipeline in action</h5> <br>
