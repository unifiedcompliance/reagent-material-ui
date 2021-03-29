(ns reagent-material-ui.icons.sip-two-tone
  "Imports @material-ui/icons/SipTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sip-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15.5 10.5h2v1h-2z", "opacity" ".3"}) (e "path" #js {"d" "M4 18h16V6H4v12zm10-9h4c.55 0 1 .45 1 1v2c0 .55-.45 1-1 1h-2.5v2H14V9zm-3 0h2v6h-2V9zm-6 4.5h3.5v-.75H6c-.55 0-1-.45-1-1V10c0-.55.45-1 1-1h4v1.5H6.5v.75H9c.55 0 1 .45 1 1V14c0 .55-.45 1-1 1H5v-1.5z", "opacity" ".3"}) (e "path" #js {"d" "M10 14v-1.75c0-.55-.45-1-1-1H6.5v-.75H10V9H6c-.55 0-1 .45-1 1v1.75c0 .55.45 1 1 1h2.5v.75H5V15h4c.55 0 1-.45 1-1z"}) (e "path" #js {"d" "M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 14H4V6h16v12z"}) (e "path" #js {"d" "M11 9h2v6h-2zm4.5 4H18c.55 0 1-.45 1-1v-2c0-.55-.45-1-1-1h-4v6h1.5v-2zm0-2.5h2v1h-2v-1z"}))
                                   "SipTwoTone"))