import React , { Component } from "react"
import Header from "./Header"
import Main from "../paginas/Main"
import Footer from "./Footer"

export default class Container extends Component {
    constructor(){
        super()
        this.state = {
            titulo : "Mi Pagina",
            links : [
                {texto:"link",url:"#"},
                {texto:"link",url:"#"},
                {texto:"link",url:"#"}
            ],
            autor : "Horacio Gutierrez"
        }
        this.handleSubmit = this.handleSubmit.bind(this)
    }

    handleSubmit(e){
        e.preventDefault()
        this.setState({
            titulo : e.target[0].value
        })
        e.target[0].value = ""
    }

    render(){
        return(
            <React.Fragment>
                <Header titulo={this.state.titulo} links={this.state.links}/>
                <Main/>
                <form onSubmit={this.handleSubmit}>
                    <input type="text"/>
                    <button>guardar</button>
                </form>
                <Footer autor={this.state.autor}/>
            </React.Fragment>
        )
    }
}