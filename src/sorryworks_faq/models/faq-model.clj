(ns sorryworks-faq.models.faq
  (:require [yesql.core :refer [defqueries]]))

(def db-spec {:classname  "org.postgresql.Driver"
                :subprotocol  "postgresql"
                :subname      "//localhost/sorryworks"})

(defqueries "sorryworks_faq/models/faq.sql")

(prn (get-faqs db-spec))
