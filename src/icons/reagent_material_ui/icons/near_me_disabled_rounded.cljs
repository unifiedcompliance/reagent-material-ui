(ns reagent-material-ui.icons.near-me-disabled-rounded
  "Imports @material-ui/icons/NearMeDisabledRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def near-me-disabled-rounded (create-svg-icon (e "path" #js {"d" "M12 6.34l6.95-2.58c.8-.3 1.58.48 1.29 1.29L17.66 12 12 6.34zm9.9 12.73L4.93 2.1a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l4.36 4.36-4.2 1.56c-.41.16-.68.54-.68.97 0 .42.26.8.65.96l6.42 2.57 2.57 6.42c.16.39.54.65.96.65.43 0 .82-.27.97-.67l1.56-4.2 4.36 4.36c.39.39 1.02.39 1.41 0 .39-.4.39-1.03 0-1.42z"})
                                               "NearMeDisabledRounded"))