(ns reagent-material-ui.icons.yard-rounded
  "Imports @material-ui/icons/YardRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def yard-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M20 2H4c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zM8 8.22c0-.86.7-1.56 1.56-1.56.33 0 .64.1.89.28l-.01-.12c0-.86.7-1.56 1.56-1.56s1.56.7 1.56 1.56l-.01.12c.26-.18.56-.28.89-.28.86 0 1.56.7 1.56 1.56 0 .62-.37 1.16-.89 1.4.52.25.89.79.89 1.41 0 .86-.7 1.56-1.56 1.56-.33 0-.64-.11-.89-.28l.01.12c0 .86-.7 1.56-1.56 1.56s-1.56-.7-1.56-1.56l.01-.12c-.26.18-.56.28-.89.28-.86 0-1.56-.7-1.56-1.56 0-.62.37-1.16.89-1.4C8.37 9.38 8 8.84 8 8.22zM12 19c-2.83 0-5.21-1.97-5.84-4.61-.18-.74.49-1.4 1.23-1.23C10.03 13.79 12 16.17 12 19c0-2.83 1.97-5.21 4.61-5.84.74-.18 1.4.49 1.23 1.23C17.21 17.03 14.83 19 12 19z"}) (e "circle" #js {"cy" "9.62", "r" "1.56", "cx" "12"}))
                                   "YardRounded"))