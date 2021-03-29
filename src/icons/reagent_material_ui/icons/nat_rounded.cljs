(ns reagent-material-ui.icons.nat-rounded
  "Imports @material-ui/icons/NatRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def nat-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M6.82 13H11v-2H6.82C6.4 9.84 5.3 9 4 9c-1.66 0-3 1.34-3 3s1.34 3 3 3c1.3 0 2.4-.84 2.82-2zM4 13c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1z"}) (e "path" #js {"d" "M22.65 11.65l-2.79-2.79c-.32-.32-.86-.1-.86.35V11h-4.05c-.46-4.68-4.16-8.42-8.84-8.94C5.52 2 5 2.46 5 3.06c0 .5.37.93.87.99C9.88 4.48 13 7.87 13 12s-3.12 7.52-7.13 7.95c-.5.06-.87.49-.87.99 0 .6.52 1.07 1.11 1 4.67-.52 8.37-4.26 8.84-8.94H19v1.79c0 .45.54.67.85.35l2.79-2.79c.2-.19.2-.51.01-.7z"}))
                                  "NatRounded"))