(ns reagent-material-ui.icons.signal-cellular-2-bar-sharp
  "Imports @material-ui/icons/SignalCellular2BarSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def signal-cellular-2-bar-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M2 22h20V2L2 22z", "fillOpacity" ".3"}) (e "path" #js {"d" "M14 10L2 22h12V10z"}))
                                                  "SignalCellular2BarSharp"))
