import React from 'react'
import "./card.css";

interface CardProps{
    suite: string;
    value: string;
    color: string;
}

function index() {
  return (
    <div className='card text-black' data-value="9♥">
        <p className='text-9xl'>♥</p>
    </div>
  )
}

export default index