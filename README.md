# Sorry Works FAQ

This is a simple microservice for search a database of questions and answers and getting access to some short video
clips where experts answer the questions.  This is primarily for an initiative in the medical doctor's community
for full disclosure.

## Getting Started

1. Start the application: `lein run-dev` \*
2. Go to [localhost:5000](http://localhost:5000/) to see: `Sorry Works FAQ`
3. Read your app's source code at src/sorryworks_faq/service.clj. Explore the docs of functions
   that define routes and responses.
4. Run your app's tests with `lein test`. Read the tests at test/sorryworks_faq/service_test.clj.
5. Learn more! See the [Links section below](#links).

\* `lein run-dev` automatically detects code changes. Alternatively, you can run in production mode
with `lein run`.

## Configuration

To configure logging see config/logback.xml. By default, the app logs to stdout and logs/.
To learn more about configuring Logback, read its [documentation](http://logback.qos.ch/documentation.html).

## Links
* [Other examples](https://github.com/pedestal/samples)

