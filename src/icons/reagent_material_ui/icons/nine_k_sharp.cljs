(ns reagent-material-ui.icons.nine-k-sharp
  "Imports @material-ui/icons/NineKSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def nine-k-sharp (create-svg-icon (e "path" #js {"d" "M8 10h1.5v1.5H8V10zm13-7H3v18h18V3zM11 9v6H6.5v-1.5h3v-1h-3V9H11zm7 6h-1.75l-1.75-2.25V15H13V9h1.5v2.25L16.25 9H18l-2.25 3L18 15z"})
                                   "NineKSharp"))