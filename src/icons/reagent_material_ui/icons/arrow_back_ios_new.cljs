(ns reagent-material-ui.icons.arrow-back-ios-new
  "Imports @material-ui/icons/ArrowBackIosNew as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def arrow-back-ios-new (create-svg-icon (e "path" #js {"d" "M17.77 3.77L16 2 6 12l10 10 1.77-1.77L9.54 12z"})
                                         "ArrowBackIosNew"))