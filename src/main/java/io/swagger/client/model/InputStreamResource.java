/*
 * ProActive Parallel Suite(TM):
 * The Open Source library for parallel and distributed
 * Workflows & Scheduling, Orchestration, Cloud Automation
 * and Big Data Analysis on Enterprise Grids & Clouds.
 *
 * Copyright (c) 2007 - 2017 ActiveEon
 * Contact: contact@activeeon.com
 *
 * This library is free software: you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation: version 3 of
 * the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 * If needed, contact us to obtain a release under GPL Version 2 or 3
 * or a different license than the AGPL.
 */
package io.swagger.client.model;

import java.io.File;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.InputStream;
import io.swagger.client.model.URI;
import io.swagger.client.model.URL;


/**
 * InputStreamResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-05T16:12:49.766+01:00")
public class InputStreamResource {
    @JsonProperty("description")
    private String description = null;

    @JsonProperty("file")
    private File file = null;

    @JsonProperty("filename")
    private String filename = null;

    @JsonProperty("inputStream")
    private InputStream inputStream = null;

    @JsonProperty("open")
    private Boolean open = null;

    @JsonProperty("readable")
    private Boolean readable = null;

    @JsonProperty("uri")
    private URI uri = null;

    @JsonProperty("url")
    private URL url = null;

    public InputStreamResource description(String description) {
        this.description = description;
        return this;
    }

    /**
    * Get description
    * @return description
    **/
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InputStreamResource file(File file) {
        this.file = file;
        return this;
    }

    /**
    * Get file
    * @return file
    **/
    @ApiModelProperty(value = "")
    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public InputStreamResource filename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
    * Get filename
    * @return filename
    **/
    @ApiModelProperty(value = "")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public InputStreamResource inputStream(InputStream inputStream) {
        this.inputStream = inputStream;
        return this;
    }

    /**
    * Get inputStream
    * @return inputStream
    **/
    @ApiModelProperty(value = "")
    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public InputStreamResource open(Boolean open) {
        this.open = open;
        return this;
    }

    /**
    * Get open
    * @return open
    **/
    @ApiModelProperty(value = "")
    public Boolean isOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public InputStreamResource readable(Boolean readable) {
        this.readable = readable;
        return this;
    }

    /**
    * Get readable
    * @return readable
    **/
    @ApiModelProperty(value = "")
    public Boolean isReadable() {
        return readable;
    }

    public void setReadable(Boolean readable) {
        this.readable = readable;
    }

    public InputStreamResource uri(URI uri) {
        this.uri = uri;
        return this;
    }

    /**
    * Get uri
    * @return uri
    **/
    @ApiModelProperty(value = "")
    public URI getUri() {
        return uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    public InputStreamResource url(URL url) {
        this.url = url;
        return this;
    }

    /**
    * Get url
    * @return url
    **/
    @ApiModelProperty(value = "")
    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InputStreamResource inputStreamResource = (InputStreamResource) o;
        return Objects.equals(this.description, inputStreamResource.description) &&
               Objects.equals(this.file, inputStreamResource.file) &&
               Objects.equals(this.filename, inputStreamResource.filename) &&
               Objects.equals(this.inputStream, inputStreamResource.inputStream) &&
               Objects.equals(this.open, inputStreamResource.open) &&
               Objects.equals(this.readable, inputStreamResource.readable) &&
               Objects.equals(this.uri, inputStreamResource.uri) && Objects.equals(this.url, inputStreamResource.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, file, filename, inputStream, open, readable, uri, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InputStreamResource {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
        sb.append("    inputStream: ").append(toIndentedString(inputStream)).append("\n");
        sb.append("    open: ").append(toIndentedString(open)).append("\n");
        sb.append("    readable: ").append(toIndentedString(readable)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
