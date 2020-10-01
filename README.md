# docutest-back

Docutest is a web application that is used to run load tests on web applications based on Swagger files 
submitted to the application. Once load tests are complete, Docutest then returns a graphical representation 
of the results. Any tests results are stored in a database, and can be retrieved as soon as the load tests complete, 
as well as can be retrieved at any point in the future

# API Reponse

The API sends back two objects, an aggregate summary and a 2D array containing each thread that was run during the test. Each row in the array represents a single request by a single thread and contains the following: [timestamp, latency, status code]. For example:

```
{
	URI: google.com/whateverpath,
	HTTPMethod: GET,
	ReponseAvg: 50,
	ReponsePercentile: 50,
	ReponseMax: 3000,
	400500Count: 100,
	SuccessFailPercentage: 50,
	ReqPerSec: 533.6
},
[
	[1601564199, 10, 200],
  	[1601564202, 15, 200],
	...
]
```
