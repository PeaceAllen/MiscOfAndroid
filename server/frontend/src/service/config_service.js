
import http from '../utils/http_utils'

export default {

    loadAllConfigs() {
        http.get("/api/config/all", {}).then(() => {

        }).catch((err) => {
            
        })
    },

}