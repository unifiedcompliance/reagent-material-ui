(ns reagent-material-ui.icons.play-disabled-outlined
  "Imports @material-ui/icons/PlayDisabledOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def play-disabled-outlined (create-svg-icon (e "path" #js {"d" "M16.45 13.62L19 12 8 5v.17zM2.81 2.81L1.39 4.22 8 10.83V19l4.99-3.18 6.78 6.78 1.41-1.41L2.81 2.81zM10 15.36v-2.53l1.55 1.55-1.55.98z"})
                                             "PlayDisabledOutlined"))