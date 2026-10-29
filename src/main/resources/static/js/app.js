
if ("serviceWorker" in navigator) {
    window.addEventListener("load", () => {
        navigator.serviceWorker.register("/sw.js")
            .then(reg => console.log("SW registrado:", reg.scope))
            .catch(err => console.error("Error SW:", err));
    });
}

document.getElementById("btnGeo").addEventListener("click", () => {
    const status = document.getElementById("status-location");

    if (!navigator.geolocation) {
        status.textContent = "Geolocalización no disponible";
        return;
    }

    navigator.geolocation.getCurrentPosition(
        pos => {
            status.textContent =
                `Latitud: ${pos.coords.latitude.toFixed(4)}, ` +
                `Longitud: ${pos.coords.longitude.toFixed(4)}`;
        },
        () => {
            status.textContent = "No se pudo obtener la ubicación";
        }
    );
});
