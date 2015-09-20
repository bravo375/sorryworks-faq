(ns sorryworks-faq.models.connection)

(def db-spec
    (or
     (get (System/getenv) "DATABASE_URL")
     "jdbc:postgresql://localhost/sorryworks"))
