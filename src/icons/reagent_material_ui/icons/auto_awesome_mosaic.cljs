(ns reagent-material-ui.icons.auto-awesome-mosaic
  "Imports @material-ui/icons/AutoAwesomeMosaic as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def auto-awesome-mosaic (create-svg-icon (e "path" #js {"d" "M3 5v14c0 1.1.89 2 2 2h6V3H5c-1.11 0-2 .9-2 2zm16-2h-6v8h8V5c0-1.1-.9-2-2-2zm-6 18h6c1.1 0 2-.9 2-2v-6h-8v8z"})
                                          "AutoAwesomeMosaic"))