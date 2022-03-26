import axios from "axios"

export default {

    get(url, params) {
        return axios.request({
            url: url,
            method: 'GET',
            params: params
        })
    },

    post(url, params) {
        return axios.request({
            url: url,
            method: "POST",
            params: params
        })
    },



}