(ns reagent-material-ui.icons.file-upload
  "Imports @material-ui/icons/FileUpload as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def file-upload (create-svg-icon (e "path" #js {"d" "M9 16h6v-6h4l-7-7-7 7h4zm-4 2h14v2H5z"})
                                  "FileUpload"))