function togglePasswordVisibility() {
    const passwordField = document.getElementById('loginPassword');
    const toggleButton = document.getElementById('togglePassword');

    if (passwordField.type === 'password') {
        passwordField.type = 'text';
        toggleButton.textContent = 'Hide password';
    } else {
        passwordField.type = 'password';
        toggleButton.textContent = 'Show password';
    }
}