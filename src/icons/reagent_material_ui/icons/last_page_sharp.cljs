(ns reagent-material-ui.icons.last-page-sharp
  "Imports @material-ui/icons/LastPageSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def last-page-sharp (create-svg-icon (e "path" #js {"d" "M5.59 7.41L10.18 12l-4.59 4.59L7 18l6-6-6-6-1.41 1.41zM16 6h2v12h-2V6z"})
                                      "LastPageSharp"))
