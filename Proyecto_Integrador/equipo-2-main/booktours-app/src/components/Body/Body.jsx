
import './body.css'
import React from 'react';
import Slider from 'react-slick';
import 'slick-carousel/slick/slick.css';
import 'slick-carousel/slick/slick-theme.css';

function Body() {
  const settings = {
    dots: true,
    infinite: true,
    speed: 500,
    slidesToShow: 4,
    slidesToScroll: 1,
    autoplay: true,
    autoplaySpeed: 2000,
  };

  const slideData = [
    {
      image: "/src/components/Body/Images/image1.jpg",
      title: "Título de la Imagen 1",
    },
    {
      image: "/src/components/Body/Images/image1.jpg",
      title: "Título de la Imagen 2",
    },
    {
      image: "/src/components/Body/Images/image1.jpg",
      title: "Título de la Imagen 3",
    },
    {
      image: "/src/components/Body/Images/image1.jpg",
      title: "Título de la Imagen 4",
    },
    {
      image: "/src/components/Body/Images/image1.jpg",
      title: "Título de la Imagen 5",
    },
    {
      image: "/src/components/Body/Images/image1.jpg",
      title: "Título de la Imagen 6",
    },
    // Agrega más objetos de datos para cada diapositiva según sea necesario
  ];

  return (
    <><div className="first-part">
      <input type="text" placeholder="Buscar por Destino, Actividad o Interés" />
      <button className="search-button">BUSCAR</button>
    </div>
    <div className="second-part">
        <Slider {...settings}>
          {slideData.map((slide, index) => (
            <div key={index} className="slide-container">
              <img src={slide.image} alt={`Imagen ${index + 1}`} />
              <h2 className="image-title">{slide.title}</h2>
            </div>
          ))}
        </Slider>
      </div></>
  );
}

export default Body;
