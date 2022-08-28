import React from "react"

export default class Header extends React.Component{
    
    render(){
        return(
            <header>
                <h1>{this.props.titulo}</h1>
                <nav>
                    {this.props.links.map((link,i)=>{
                        return <a href={link.url} key={i}>{link.texto}</a>
                    })}
                </nav>  
            </header>
        )
    }
}