(defproject prism "0.0.1"
  :description "spike timing dependent plasticity"
  :url "http://prismofeverything.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [uncomplicate/neanderthal "0.18.0"
                  :exclusions
                  [org.jcuda/jcuda-natives
                   org.jcuda/jcublas-natives]]])
