(ns reagent-material-ui.icons.security-update-good-two-tone
  "Imports @material-ui/icons/SecurityUpdateGoodTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def security-update-good-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M7 21h10v-1H7v1zM7 3v1h10V3H7z", "opacity" ".3"}) (e "path" #js {"d" "M17 1.01L7 1c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2V3c0-1.1-.9-1.99-2-1.99zM17 21H7v-1h10v1zm0-3H7V6h10v12zm0-14H7V3h10v1zm-1 6.05l-1.41-1.41-3.54 3.54-1.41-1.41-1.41 1.41L11.05 15 16 10.05z"}))
                                                    "SecurityUpdateGoodTwoTone"))