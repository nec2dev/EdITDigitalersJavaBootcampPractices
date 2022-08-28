const HtmlWebpackPlugin = require("html-webpack-plugin")
const HtmlPlugin = new HtmlWebpackPlugin({
    template : __dirname + "/dist/index.html",
    filename : "index.html",
    inject : "body"
})


module.exports = {
    entry : __dirname + "/src/app.js",
    output : {
        path : __dirname + "/dist",
        filename : "bundle.js"
    },
    module : {
        rules : [
            {
                test : /\.js$/,
                use : "babel-loader",
                exclude : /node_modules/
            }
        ]
    },
    mode : "development",
    plugins : [HtmlPlugin]
}