(ns reagent-material-ui.icons.cameraswitch-two-tone
  "Imports @material-ui/icons/CameraswitchTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def cameraswitch-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M13.17 8h-2.34l-1 1H8v6h8V9h-1.83l-1-1zM12 14c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2z", "opacity" ".3"}) (e "path" #js {"d" "M16 7h-1l-1-1h-4L9 7H8c-1.1 0-2 .9-2 2v6c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V9c0-1.1-.9-2-2-2zm0 8H8V9h1.83l1-1h2.34l1 1H16v6z"}) (e "circle" #js {"cy" "12", "r" "2", "cx" "12"}) (e "path" #js {"d" "M8.57.52L13.05 5V2.05c4.72.47 8.48 4.23 8.95 8.95h2C23.34 3.03 15.49-1.58 8.57.52zm2.38 21.44c-4.72-.47-8.48-4.23-8.95-8.95H0c.66 7.97 8.51 12.58 15.43 10.48l-4.48-4.48v2.95z"}))
                                            "CameraswitchTwoTone"))