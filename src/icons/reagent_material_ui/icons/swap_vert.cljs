(ns reagent-material-ui.icons.swap-vert
  "Imports @material-ui/icons/SwapVert as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def swap-vert (create-svg-icon (e "path" #js {"d" "M16 17.01V10h-2v7.01h-3L15 21l4-3.99h-3zM9 3L5 6.99h3V14h2V6.99h3L9 3z"})
                                "SwapVert"))
