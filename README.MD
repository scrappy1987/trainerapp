Run the following:

From the directory that contains the POM file:

mvn clean package docker:build

Then run:

docker run --name trainer-mysql -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=trainerapp -e MYSQL_USER=trainer_user -e MYSQL_PASSWORD=trainer_pass -d mysql:5.6

docker logs trainer-mysql (ensure mysql server is up)

docker run -p 8080:8080 --name trainer-app --link trainer-mysql:mysql -d trainerapp/trainerapp

docker logs trainer-app (ensure app is up by accessing http://localhost:8080)

GET URL: /api/v1/trainer


POST URL: /api/v1/trainer

Example body:
{
        "firstName": "Alice",
        "secondName": "Day",
        "position": "junior trainer",
        "subject": [
            {
                "subjectName": "DB",
                "rating": {
                    "rating": 3,
                    "yearsExperience": 5
                }
            },
            {
                "subjectName": "JavaEE",
                "rating": {
                    "rating": 4,
                    "yearsExperience": 6
                }
            }
        ]
}
