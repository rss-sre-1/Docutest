# docutest-back

Docutest is a web application that is used to run load tests on web applications based on Swagger files 
submitted to the application. Once load tests are complete, Docutest then returns a graphical representation 
of the results. Any tests results are stored in a database, and can be retrieved as soon as the load tests complete, 
as well as can be retrieved at any point in the future

# API Reponse

The API sends back two objects, an aggregate summary and a 2D array containing each thread that was run during the test. The aggregate object contains:

URI: URI

HTTPMethod: Request method

ResponseAvg: Average latency in ms

ResponsePercentile: 50th percentile latency in ms

ResponseMax: Highest response time in ms

FailCount: Number of 4XX/5XX responses

SuccessFailPercentage: Percentage of 2XX responses to 4XX/5XX responses

ReqPerSec: Total Nnmber of requests per second


For the array, each row represents a single request by a single thread and contains the following: [timestamp, latency, status code]. For example:

```
{
	URI: google.com/whateverpath,
	HTTPMethod: GET,
	ReponseAvg: 50,
	ReponsePercentile: 50,
	ReponseMax: 3000,
	FailCount: 100,
	SuccessFailPercentage: 50,
	ReqPerSec: 533.6
},
[
	[1601564199, 10, 200],
  	[1601564202, 15, 200],
	...
]
```

