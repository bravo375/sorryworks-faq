(ns sorryworks-faq.service-test
  (:require [clojure.test :refer :all]
            [io.pedestal.test :refer :all]
            [io.pedestal.http :as bootstrap]
            [sorryworks-faq.service :as service]
            [sorryworks-faq.models.faq-model :as faq]))

(deftest get-faqs-test
  (is (= (count (faq/get-faqs faq/db-spec)) 3)))

;; (def service
;;   (::bootstrap/service-fn (bootstrap/create-servlet service/service)))

;; (deftest home-page-test
;;   (is (=
;;        (:body (response-for service :get "/"))
;;        "Hello World!"))
;;   (is (=
;;        (:headers (response-for service :get "/"))
;;        {"Content-Type" "text/html;charset=UTF-8"
;;         "Strict-Transport-Security" "max-age=31536000; includeSubdomains"
;;         "X-Frame-Options" "DENY"
;;         "X-Content-Type-Options" "nosniff"
;;         "X-XSS-Protection" "1; mode=block"})))


;; (deftest about-page-test
;;   (is (.contains
;;        (:body (response-for service :get "/about"))
;;        "Clojure 1.6"))
;;   (is (=
;;        (:headers (response-for service :get "/about"))
;;        {"Content-Type" "text/html;charset=UTF-8"
;;         "Strict-Transport-Security" "max-age=31536000; includeSubdomains"
;;         "X-Frame-Options" "DENY"
;;         "X-Content-Type-Options" "nosniff"
;;         "X-XSS-Protection" "1; mode=block"})))

