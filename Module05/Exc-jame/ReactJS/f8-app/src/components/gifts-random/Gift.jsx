import React, { useState } from 'react'

const gifts = [
    "CPU i9",
    "RAM 32GB RGB",
    "RGB Keyboard"
]
function Gift() {
    const [gift, setGift] = useState()
    const handleRandom = () => {
        const index = Math.floor(Math.random() * gifts.length)
        setGift(
            gifts[index]
        );
    }
    return (
        <div style={{ padding: 32 }}>
            <h1>{gift || "Chưa có phần thưởng"}</h1>
            <button onClick={handleRandom}>Lấy thưởng</button>
        </div>
    );
}

export default Gift