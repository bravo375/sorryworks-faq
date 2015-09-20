(ns sorryworks-faq.models.faq-model
  (:require [yesql.core :refer [defqueries]]))

(def db-spec {:classname    "org.postgresql.Driver"
              :subprotocol  "postgresql"
              :subname      "//localhost/sorryworks"})

(defqueries "sorryworks_faq/models/faq.sql")
