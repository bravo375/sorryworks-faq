(defproject sorryworks-faq "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [io.pedestal/pedestal.service "0.4.0"]

                 ;; Remove this line and uncomment one of the next lines to
                 ;; use Immutant or Tomcat instead of Jetty:
                 [io.pedestal/pedestal.jetty "0.4.0"]
                 ;; [io.pedestal/pedestal.immutant "0.4.0"]
                 ;; [io.pedestal/pedestal.tomcat "0.4.0"]

                 [migratus "0.8.4"]
                 [migratus-lein "0.1.0"]
                 [org.clojure/java.jdbc "0.3.5"]
                 [org.postgresql/postgresql "9.4-1201-jdbc41"]
                 [yesql "0.4.2"]

                 [com.h2database/h2 "1.4.187"]
                 [ch.qos.logback/logback-classic "1.1.2" :exclusions [org.slf4j/slf4j-api]]
                 [org.slf4j/jul-to-slf4j "1.7.7"]
                 [org.slf4j/jcl-over-slf4j "1.7.7"]
                 [org.slf4j/log4j-over-slf4j "1.7.7"]]
  :min-lein-version "2.0.0"
  :resource-paths ["config", "resources"]
  :migratus ~(or (get (System/getenv) "DATABASE_URL")
                {:store                  :database
                :migration-dir         "migrations"
                :migration-table-name  "_migrations"
                :db  {:classname  "org.postgresql.Driver"
                :subprotocol  "postgresql"
                :subname      "//localhost/sorryworks"}})

  :plugins [[migratus-lein "0.1.7"]]

  :profiles {:dev {:aliases {"run-dev" ["trampoline" "run" "-m" "sorryworks-faq.server/run-dev"]}
                   :dependencies [[io.pedestal/pedestal.service-tools "0.4.0"]]}
             :uberjar {:aot [sorryworks-faq.server]}}

  :main ^{:skip-aot true} sorryworks-faq.server)
