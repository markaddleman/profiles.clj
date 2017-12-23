{:dev {:plugins      [[lein-ancient "0.6.15"]]
       :dependencies [[com.cognitect/transcriptor "0.1.5"]
                      [org.clojure/tools.namespace "0.2.11"]
                      [vvvvalvalval/scope-capture "0.1.4"]
                      [inspectable "0.2.2"]
                      [spec-provider "0.4.10"]
                      [alembic "0.3.2"]]
       :injections   [(require '[sc.api :as -sc])
                      (require '[clojure.tools.namespace.repl :refer [refresh]])
                      (require '[cognitect.transcriptor :as -xr :refer (check!)])
                      (require '[inspectable.repl :refer [why browse-spec]])
                      (require '[clojure.spec.test.alpha :as -st])
                      (require '[alembic.still :refer [load-project]])
                      (refresh)
                      (-st/instrument)]
       :source-paths ["dev"]}}
