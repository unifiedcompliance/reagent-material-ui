(ns reagent-material-ui.icons.signal-wifi-2-bar-outlined
  "Imports @material-ui/icons/SignalWifi2BarOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def signal-wifi-2-bar-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M23.64 7c-.45-.34-4.93-4-11.64-4C5.28 3 .81 6.66.36 7L12 21.5 23.64 7z", "fillOpacity" ".3"}) (e "path" #js {"d" "M4.79 12.52L12 21.5l7.21-8.99C18.85 12.24 16.1 10 12 10s-6.85 2.24-7.21 2.52z"}))
                                                 "SignalWifi2BarOutlined"))
