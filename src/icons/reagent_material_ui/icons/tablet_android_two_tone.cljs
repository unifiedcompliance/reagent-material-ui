(ns reagent-material-ui.icons.tablet-android-two-tone
  "Imports @material-ui/icons/TabletAndroidTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def tablet-android-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4.75 3h14.5v16H4.75z", "opacity" ".3"}) (e "path" #js {"d" "M18 0H6C4.34 0 3 1.34 3 3v18c0 1.66 1.34 3 3 3h12c1.66 0 3-1.34 3-3V3c0-1.66-1.34-3-3-3zm-4 22h-4v-1h4v1zm5.25-3H4.75V3h14.5v16z"}))
                                              "TabletAndroidTwoTone"))
