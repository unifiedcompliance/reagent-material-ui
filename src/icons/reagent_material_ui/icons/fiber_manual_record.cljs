(ns reagent-material-ui.icons.fiber-manual-record
  "Imports @material-ui/icons/FiberManualRecord as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def fiber-manual-record (create-svg-icon (e "circle" #js {"cy" "12", "r" "8", "cx" "12"})
                                          "FiberManualRecord"))
