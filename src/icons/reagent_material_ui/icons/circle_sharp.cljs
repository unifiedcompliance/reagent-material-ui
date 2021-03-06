(ns reagent-material-ui.icons.circle-sharp
  "Imports @material-ui/icons/CircleSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def circle-sharp (create-svg-icon (e "path" #js {"d" "M12 2C6.47 2 2 6.47 2 12s4.47 10 10 10 10-4.47 10-10S17.53 2 12 2z"})
                                   "CircleSharp"))