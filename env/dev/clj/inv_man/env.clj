(ns inv-man.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [inv-man.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[inv-man started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[inv-man has shut down successfully]=-"))
   :middleware wrap-dev})
