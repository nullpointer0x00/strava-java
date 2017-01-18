# strava-java

The strava-java project is a client library for Strava's V3 API [Reference](https://strava.github.io/api/) 

_Project is still under development.  It would be stellar if you would like to contribute to the effort._

## Packaging

To generate a jar file from the source.  The final jar will be located in the generated directory called target.

```
mvn clean package -DskipTests
```


## Usage

```java
        Connection connection = new Connection("someapi-key");
        StravaResources resources = connection.getApi();
        AthleteStravaApi athleteStravaApi = resources.getAthleteStravaApi();
        Athlete athlete = athleteStravaApi.getAthelete();        
```

## How-To Contribute

You will need to have tests for every feature that is added.  In order to setup your testing environment, you will need to add a file under the testing resouces with your strava access token.

test/java/resouces/strava-access-token.txt

Within that file you will place your key on the first line.

In the test files that use the access token you will have this setup.
```java
    @Before
    public void setUp() throws Exception {
        //must add strava-access-token.txt to src/test/resources folder
        //file must contain one line with your strava access token
        InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("strava-access-token.txt");
        accessToken = IOUtils.toString(stream, "UTF-8");
        this.stravaResources = new StravaResources(accessToken);
    }
```