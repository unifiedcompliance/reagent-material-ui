(ns reagent-material-ui.icons.book-sharp
  "Imports @material-ui/icons/BookSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def book-sharp (create-svg-icon (e "path" #js {"d" "M20 2H4v20h16V2zM6 4h5v8l-2.5-1.5L6 12V4z"})
                                 "BookSharp"))
