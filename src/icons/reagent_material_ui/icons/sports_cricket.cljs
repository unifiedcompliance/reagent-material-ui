(ns reagent-material-ui.icons.sports-cricket
  "Imports @material-ui/icons/SportsCricket as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sports-cricket (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15.05 12.81L6.56 4.32a.9959.9959 0 00-1.41 0L2.32 7.15c-.39.39-.39 1.02 0 1.41l8.49 8.49c.39.39 1.02.39 1.41 0l2.83-2.83c.39-.39.39-1.02 0-1.41zM14.3412 17.7562l1.4142-1.4142 4.2426 4.2426-1.4142 1.4142z"}) (e "circle" #js {"cy" "5.5", "r" "3.5", "cx" "18.5"}))
                                     "SportsCricket"))
