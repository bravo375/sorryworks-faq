(ns sorryworks-faq.models.faq-model
  (:require [yesql.core :refer [defqueries]]))

(defqueries "sorryworks_faq/models/faq.sql")
